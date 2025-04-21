package com.simplesdental.product.infrastructure.mapper;

import com.simplesdental.product.domain.model.Category;
import com.simplesdental.product.domain.model.Product;
import com.simplesdental.product.infrastructure.dto.CategoryOutput;
import com.simplesdental.product.infrastructure.dto.request.CategoryRequest;
import com.simplesdental.product.infrastructure.dto.response.CategoryResponse;
import com.simplesdental.product.infrastructure.dto.response.CategoryWithoutProductsResponse;
import com.simplesdental.product.infrastructure.dto.response.field.ProductResponse;
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
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryResponse toResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponse categoryResponse = new CategoryResponse();

        categoryResponse.setId( category.getId() );
        categoryResponse.setName( category.getName() );
        categoryResponse.setDescription( category.getDescription() );
        categoryResponse.setProducts( productListToProductResponseList( category.getProducts() ) );

        return categoryResponse;
    }

    @Override
    public CategoryResponse toResponse(CategoryOutput output) {
        if ( output == null ) {
            return null;
        }

        CategoryResponse categoryResponse = new CategoryResponse();

        categoryResponse.setId( output.getId() );
        categoryResponse.setName( output.getName() );
        categoryResponse.setDescription( output.getDescription() );
        categoryResponse.setProducts( productListToProductResponseList( output.getProducts() ) );

        return categoryResponse;
    }

    @Override
    public CategoryWithoutProductsResponse toSaveResponse(CategoryOutput output) {
        if ( output == null ) {
            return null;
        }

        CategoryWithoutProductsResponse categoryWithoutProductsResponse = new CategoryWithoutProductsResponse();

        categoryWithoutProductsResponse.setId( output.getId() );
        categoryWithoutProductsResponse.setName( output.getName() );
        categoryWithoutProductsResponse.setDescription( output.getDescription() );

        return categoryWithoutProductsResponse;
    }

    @Override
    public CategoryOutput toResponseOutput(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryOutput categoryOutput = new CategoryOutput();

        categoryOutput.setId( category.getId() );
        categoryOutput.setName( category.getName() );
        categoryOutput.setDescription( category.getDescription() );
        List<Product> list = category.getProducts();
        if ( list != null ) {
            categoryOutput.setProducts( new ArrayList<Product>( list ) );
        }

        return categoryOutput;
    }

    @Override
    public List<CategoryResponse> toResponseList(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryResponse> list = new ArrayList<CategoryResponse>( categories.size() );
        for ( Category category : categories ) {
            list.add( toResponse( category ) );
        }

        return list;
    }

    @Override
    public List<CategoryOutput> toResponseListOutput(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryOutput> list = new ArrayList<CategoryOutput>( categories.size() );
        for ( Category category : categories ) {
            list.add( toResponseOutput( category ) );
        }

        return list;
    }

    @Override
    public Category toEntity(CategoryRequest request) {
        if ( request == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( request.getName() );
        category.setDescription( request.getDescription() );

        return category;
    }

    @Override
    public void updateEntityFromDto(CategoryRequest request, Category entity) {
        if ( request == null ) {
            return;
        }

        entity.setName( request.getName() );
        entity.setDescription( request.getDescription() );
    }

    protected ProductResponse productToProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        productResponse.setId( product.getId() );
        productResponse.setName( product.getName() );
        productResponse.setDescription( product.getDescription() );
        productResponse.setPrice( product.getPrice() );
        productResponse.setStatus( product.getStatus() );
        productResponse.setCode( product.getCode() );

        return productResponse;
    }

    protected List<ProductResponse> productListToProductResponseList(List<Product> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductResponse> list1 = new ArrayList<ProductResponse>( list.size() );
        for ( Product product : list ) {
            list1.add( productToProductResponse( product ) );
        }

        return list1;
    }
}
