package com.simplesdental.product.infrastructure.mapper;

import com.simplesdental.product.domain.model.Category;
import com.simplesdental.product.domain.model.Product;
import com.simplesdental.product.infrastructure.dto.ProductOutput;
import com.simplesdental.product.infrastructure.dto.request.ProductRequest;
import com.simplesdental.product.infrastructure.dto.response.ProductResponse;
import com.simplesdental.product.infrastructure.dto.response.ProductResponseV2;
import com.simplesdental.product.infrastructure.dto.response.field.CategoryResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-21T07:33:47-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResponse toResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        productResponse.setName( product.getName() );
        productResponse.setDescription( product.getDescription() );
        productResponse.setPrice( product.getPrice() );
        productResponse.setStatus( product.getStatus() );
        productResponse.setCode( product.getCode() );
        productResponse.setCategory( categoryToCategoryResponse( product.getCategory() ) );

        return productResponse;
    }

    @Override
    public Product toEntity(ProductRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        product.setCategory( mapCategory( dto.getCategoryId() ) );
        product.setName( dto.getName() );
        product.setDescription( dto.getDescription() );
        product.setPrice( dto.getPrice() );
        product.setStatus( dto.getStatus() );
        product.setCode( dto.getCode() );

        return product;
    }

    @Override
    public void updateEntityFromDto(ProductRequest dto, Product entity) {
        if ( dto == null ) {
            return;
        }

        entity.setCategory( mapCategory( dto.getCategoryId() ) );
        entity.setName( dto.getName() );
        entity.setDescription( dto.getDescription() );
        entity.setPrice( dto.getPrice() );
        entity.setStatus( dto.getStatus() );
        entity.setCode( dto.getCode() );
    }

    @Override
    public ProductResponse toResponse(ProductOutput output) {
        if ( output == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        productResponse.setName( output.getName() );
        productResponse.setDescription( output.getDescription() );
        productResponse.setPrice( output.getPrice() );
        productResponse.setStatus( output.getStatus() );
        productResponse.setCode( output.getCode() );
        productResponse.setCategory( categoryToCategoryResponse( output.getCategory() ) );

        return productResponse;
    }

    @Override
    public ProductOutput toOutput(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductOutput productOutput = new ProductOutput();

        productOutput.setName( product.getName() );
        productOutput.setDescription( product.getDescription() );
        productOutput.setPrice( product.getPrice() );
        productOutput.setStatus( product.getStatus() );
        productOutput.setCode( product.getCode() );
        productOutput.setCategory( product.getCategory() );

        return productOutput;
    }

    @Override
    public ProductResponseV2 toResponseV2(ProductOutput output) {
        if ( output == null ) {
            return null;
        }

        ProductResponseV2 productResponseV2 = new ProductResponseV2();

        productResponseV2.setCode( stringToInt( output.getCode() ) );
        productResponseV2.setName( output.getName() );
        productResponseV2.setDescription( output.getDescription() );
        productResponseV2.setPrice( output.getPrice() );
        productResponseV2.setStatus( output.getStatus() );
        productResponseV2.setCategory( categoryToCategoryResponse( output.getCategory() ) );

        return productResponseV2;
    }

    @Override
    public List<ProductResponseV2> toResponseV2List(List<ProductOutput> outputs) {
        if ( outputs == null ) {
            return null;
        }

        List<ProductResponseV2> list = new ArrayList<ProductResponseV2>( outputs.size() );
        for ( ProductOutput productOutput : outputs ) {
            list.add( toResponseV2( productOutput ) );
        }

        return list;
    }

    protected CategoryResponse categoryToCategoryResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponse categoryResponse = new CategoryResponse();

        categoryResponse.setId( category.getId() );
        categoryResponse.setName( category.getName() );
        categoryResponse.setDescription( category.getDescription() );

        return categoryResponse;
    }
}
